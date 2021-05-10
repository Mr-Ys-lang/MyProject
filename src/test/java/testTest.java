import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

public class testTest {

	private static final Logger logger = Logger.getLogger(testTest.class);

	@Test
	public void testforEach() {
		List<String> list = new ArrayList<>(2);
		list.add("1");
		list.add("2");
		list.add("3");
		Iterator<String> it = list.iterator();
		while (it.hasNext()){
			String temp = it.next();
			logger.info(temp);
			if("1".equals(temp)){
				it.remove();
			}
		}
		logger.info(list);
		logger.error(list);
	}

	@Test
	public void testStringBuilder(){
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("abc");
		stringBuilder.append("def");
		logger.info(stringBuilder);
		stringBuilder.setCharAt(2,'d');
		logger.info(stringBuilder.toString());
		stringBuilder.insert(2,'k');
		logger.info(stringBuilder.toString());
	}

	@Test
	public void testStringBuffer(){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("abc");
		stringBuffer.append(new char[]{'d','f','g','h','j'});
		logger.info(stringBuffer);
		stringBuffer.insert(4,'e');
		logger.info(stringBuffer);
		stringBuffer.delete(2,stringBuffer.length());
		logger.info(stringBuffer);
	}

	@Test
	public void testIo(){
		File file = new File("D:","HelloWorld.txt");

		/**创建文件，返回一个布尔值**/
		boolean isCreate;
		try{
			isCreate = file.createNewFile();
			if(isCreate){
				logger.info("创建文件成功！");
			}else{
				logger.info("创建文件失败！文件已存在");
			}
		}catch (IOException e){
			logger.error("创建文件失败：" + e.toString());
		}

		if(file.isFile()){
			logger.info("这是一个文件");
		}else{
			logger.info("这是一个目录");
		}

		File file2 = new File("D:/TOTest");
		file2.mkdirs();
		File file3 = new File(file2.getPath() + "/" + file.getName());
		// file.renameTo(file2.getPath()+'/'+file.getName())
		if(file.renameTo(file3)){
			logger.info("文件移动成功！");
		} else {
			logger.error("文件移动失败");
		}

		String[] arr = file2.list();
		for(String str : arr){
			logger.info(str);
		}
	}

	@Test
	public void testToArray(){
		List<String> list = new ArrayList<>();
		list.add("wen");
		list.add("jian");
		list.add("zhong");
		String[] arr = new String[2];
		arr = list.toArray(arr);
		for (String str : arr) {
			logger.info(str);
		}
	}
}