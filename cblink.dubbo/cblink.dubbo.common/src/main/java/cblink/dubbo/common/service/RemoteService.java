package cblink.dubbo.common.service;

public interface RemoteService {
	/**
	 * 根据类型获取不同信息
	 * @param type
	 * @return
	 */
	public String getMessageByType(String type,String value);
}
