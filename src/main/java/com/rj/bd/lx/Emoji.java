package com.rj.bd.lx;

import cn.hutool.extra.emoji.EmojiUtil;

/**
 * @desc   Emoji表情
 * @author ZYF
 *
 */

public class Emoji {

	public static void main(String[] args) {
		
		//1.转义Emoji字符
		String alias = EmojiUtil.toAlias("😄");//:smile:
		System.out.println(alias);
		
		//2.将转义的别名转为Emoji字符
		String emoji = EmojiUtil.toUnicode(":smile:");//😄
		System.out.println(emoji);
		
		//3.将字符串中的Unicode Emoji字符转换为HTML表现形式
		String alias2 = EmojiUtil.toHtml("😄");//&#128102;
		System.out.println(alias2);
	}

}
