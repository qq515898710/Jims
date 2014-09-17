package org.mo.open.common.util;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;

public class MatrixToImageWriterTest {

	@Test
	public void test() {
		try {

			String content = "女人";
			String path = "F:/file";
			MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
			Map hints = new HashMap();
			hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
			BitMatrix bitMatrix = multiFormatWriter.encode(content,
					BarcodeFormat.QR_CODE, 400, 400, hints);
			File file1 = new File(path, "餐巾纸.jpg");
			MatrixToImageWriter.writeToFile(bitMatrix, "jpg", file1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
