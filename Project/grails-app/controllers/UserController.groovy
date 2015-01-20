import grails.converters.JSON
import groovy.json.JsonSlurper


class UserController {
	
	def userService
	
	def login () {
		
		def resultData = userService.login(params.userName, params.password)		
		session.user = resultData		
		redirect(action: "showData")		
	}
	
	def showData() {
		def items = userService.getItems(session.user.id)
		[ itemList: items, userInstance: session.user ]
	}
}
