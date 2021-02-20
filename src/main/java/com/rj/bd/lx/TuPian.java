package com.rj.bd.lx;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import cn.hutool.core.img.ImgUtil;
import cn.hutool.core.io.FileUtil;

/**
 * @desc   修改图片
 * @author ZYF
 *
 */

public class TuPian {

	public static void main(String[] args) {
	/*
	//1.scale 缩放图片
		ImgUtil.scale(
			    FileUtil.file("d:/AAA.jpg"), 
			    FileUtil.file("d:/AAA_result.jpg"), 
			    0.5f//缩放比例
			);
	*/
		
	//2.cut 剪裁图片
		ImgUtil.cut(
			    FileUtil.file("d:/AAA.jpg"), 
			    FileUtil.file("d:/face_result.jpg"), 
			    new Rectangle(200, 200, 100, 100)//裁剪的矩形区域
			);
		
	//3.slice 按照行列剪裁切片（将图片分为20行和20列）
		ImgUtil.slice(FileUtil.file("e:/test2.png"), FileUtil.file("e:/dest/"), 10, 10);
		
	//4.convert 图片类型转换，支持GIF->JPG、GIF->PNG、PNG->JPG、PNG->GIF(X)、BMP->PNG等
		ImgUtil.convert(FileUtil.file("e:/test2.png"), FileUtil.file("e:/test2Convert.jpg"));
		
	//5.gray 彩色转为黑白
		ImgUtil.gray(FileUtil.file("d:/logo.png"), FileUtil.file("d:/result.png"));
	
	//6.pressText 添加文字水印
		ImgUtil.pressText(//
			    FileUtil.file("e:/pic/face.jpg"), //
			    FileUtil.file("e:/pic/test2_result.png"), //
			    "赵宇飞", Color.WHITE, //文字
			    new Font("黑体", Font.BOLD, 100), //字体
			    0, //x坐标修正值。 默认在中间，偏移量相对于中间偏移
			    0, //y坐标修正值。 默认在中间，偏移量相对于中间偏移
			    0.8f//透明度：alpha 必须是范围 [0.0, 1.0] 之内（包含边界值）的一个浮点数字
			);
	
	//7.pressImage 添加图片水印
		ImgUtil.pressImage(
			    FileUtil.file("d:/picTest/1.jpg"), 
			    FileUtil.file("d:/picTest/dest.jpg"), 
			    ImgUtil.read(FileUtil.file("d:/picTest/1432613.jpg")), //水印图片
			    0, //x坐标修正值。 默认在中间，偏移量相对于中间偏移
			    0, //y坐标修正值。 默认在中间，偏移量相对于中间偏移
			    0.1f
			);
	}

}
