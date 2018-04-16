/**
 * ���ڽ��ڵ��ӽ�������
 * Copyright (c) 1995-2018 All Rights Reserved.
 */
package cn.cash.register.util;

import net.sourceforge.pinyin4j.PinyinHelper;

/**
 * ���ָ�����
 * @author HuHui
 * @version $Id: PinyinUtil.java, v 0.1 2018��4��16�� ����7:23:32 HuHui Exp $
 */
public class PinyinUtil {

    /**
     * ��ȡÿ�����ֵ�Сд����ĸ
     * @param str ����ȡ�ַ���
     * @return
     */
    public static final String getPinyinHeadLowerChar(String str) {
        String convert = "";
        for (int j = 0; j < str.length(); j++) {
            char word = str.charAt(j);
            // ��ȡ���ֵ�����ĸ
            String[] pinyinArray = PinyinHelper.toHanyuPinyinStringArray(word);
            if (pinyinArray != null) {
                convert += pinyinArray[0].charAt(0);
            } else {
                convert += word;
            }
        }
        return convert.toLowerCase();
    }

}
