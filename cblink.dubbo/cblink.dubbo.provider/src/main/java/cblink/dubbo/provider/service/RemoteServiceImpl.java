package cblink.dubbo.provider.service;

import cblink.dubbo.common.service.RemoteService;

public class RemoteServiceImpl implements RemoteService {

	@Override
	public String getMessageByType(String type,String value) {
		// TODO Auto-generated method stub
		String message = "";
		switch(type){
		case "name":
			message = "this name is :"+value;
			break;
		case "grade":
			message = "this grade is :"+value;
			break;
		default:
			message = "this is not message!";
			break;
		}
		return message;
	}

}
