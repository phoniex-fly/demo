package com.designPattern.demo.export.pattern;

import java.util.List;
import java.util.Map;

/**
 *
 * @ClassName: ExportTemplet
 * @Description:TODO(文件导出模板类)
 * @author: Shixiaoyan
 * @date: 2021年1月19日 上午9:41:09
 * @Copyright:
 */
public abstract class ExportTemplet {

	/**
	 * 文件导出
	 */
	public final void export() {
		Map<String, String> data = this.findData();
		List<String> title = this.findTitle();
		String path = createFile(data, title, "");
		if (uploadDoc()) {
			upload(path);
		}
		this.download(path);
	}

	/**
	 * 查找导出的数据
	 * 
	 * @return
	 */
	protected abstract Map<String, String> findData();

	/**
	 * 查找导出的表头
	 * 
	 * @return
	 */
	protected abstract List<String> findTitle();

	/**
	 * 
	 * @param data
	 * @param title
	 * @param filename
	 * @return文件在服务器存储路径
	 */
	private String createFile(Map<String, String> data, List<String> title, String filename) {
		System.out.println("生成文件");
		return "";
	};

	/**
	 * 钩子方法：是否上传至文档云
	 * 
	 * 若不上传，子类覆盖本方法返回false
	 * 
	 * @return
	 */
	protected boolean uploadDoc() {
		return true;
	}

	/**
	 * 文件上传至文档云
	 * 
	 * @param path
	 */
	private void upload(String path) {
		System.out.println("上传至文档云");
	}

	/**
	 * 文件下载
	 * 
	 * @param path
	 */
	private void download(String path) {
		System.out.println("文件下载");
	}
}
