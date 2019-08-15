package com.mtm.party.mobile.util;

import net.coobird.thumbnailator.Thumbnails;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.UUID;

public class ImageUtils {



  /**
   * 功能描述: <br>
   * 〈图片上传工具〉
   *  将图片上传到服务器上Tomcat所在的路径。
   *  并拼接处可访问的路径返回
   *
   * @param file 图片文件
   * @param targetPath 上传目标路径
   * @return   上传成功后的文件全路径
   * @since  1.0.0
   * @Author yihan.hu
   * @Date 2019/8/13 14:30
   */
  public static String imgUpload(MultipartFile file,String targetPath,String imgNetPath){
    String fileName = file.getOriginalFilename();
    String[] split = fileName.split("\\.");
//    使用UUID重命名避免重名问题
    String uuid = UUID.randomUUID().toString();
    String uuidFileName = uuid + "." + split[split.length-1];
    String targetFileName = targetPath + uuidFileName;
    File target =  new File(targetFileName);
    try {
      file.transferTo(target);
      return imgNetPath + uuidFileName;
    } catch (IOException e) {
      e.printStackTrace();
      return "上传失败";
    }

  }


  /**
   * 根据指定大小和指定精度压缩图片
   *
   * @param srcPath
   *            源图片地址
   * @param desPath
   *            目标图片地址
   * @param desFileSize
   *            指定图片大小，单位kb
   * @param accuracy
   *            精度，递归压缩的比率，建议小于0.9
   * @return
   */
  public static String commpressPicForScale(String srcPath, String desPath,
                                            long desFileSize, double accuracy) {
    if (null==srcPath || "".equals(srcPath)) {
      return null;
    }
    if (!new File(srcPath).exists()) {
      return null;
    }
    try {
      File srcFile = new File(srcPath);
      long srcFileSize = srcFile.length();
      System.out.println("源图片：" + srcPath + "，大小：" + srcFileSize / 1024
          + "kb");

      // 1、先转换成jpg
      Thumbnails.of(srcPath).scale(1f).toFile(desPath);
      // 递归压缩，直到目标文件大小小于desFileSize
      commpressPicCycle(desPath, desFileSize, accuracy);

      File desFile = new File(desPath);
      System.out.println("目标图片：" + desPath + "，大小" + desFile.length()
          / 1024 + "kb");
      System.out.println("图片压缩完成！");
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
    return desPath;
  }

  private static void commpressPicCycle(String desPath, long desFileSize,
                                        double accuracy) throws IOException {
    File srcFileJPG = new File(desPath);
    long srcFileSizeJPG = srcFileJPG.length();
    // 2、判断大小，如果小于500kb，不压缩；如果大于等于500kb，压缩
    if (srcFileSizeJPG <= desFileSize * 1024) {
      return;
    }
    // 计算宽高
    BufferedImage bim = ImageIO.read(srcFileJPG);
    int srcWdith = bim.getWidth();
    int srcHeigth = bim.getHeight();
    int desWidth = new BigDecimal(srcWdith).multiply(
        new BigDecimal(accuracy)).intValue();
    int desHeight = new BigDecimal(srcHeigth).multiply(
        new BigDecimal(accuracy)).intValue();

    Thumbnails.of(desPath).size(desWidth, desHeight)
        .outputQuality(accuracy).toFile(desPath);
    commpressPicCycle(desPath, desFileSize, accuracy);

  }

}
