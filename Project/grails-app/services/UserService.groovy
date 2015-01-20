import ApiRestServices.APIUserService;
import groovy.mock.interceptor.MockFor;

public class UserService {
	
	def apiUserService
	def apiItemsService
	
	def login (userName, password){
		return apiUserService.CheckCredentials(userName, password)
	}
	
	def getItems (userId) {
		def json = apiItemsService.getItems(userId)	
		
		def items = []
		json.each {
			items.add( new Product( idData: it.idData, title: it.title, image: it.thumbnail ) )
		}
		
		return items
	}
}
