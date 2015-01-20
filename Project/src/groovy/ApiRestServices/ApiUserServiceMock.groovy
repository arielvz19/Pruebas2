package ApiRestServices

import grails.converters.JSON
import org.codehaus.groovy.grails.web.json.JSONObject


class ApiUserServiceMock {
	JSONObject CheckCredentials(String userName, String pasword) {
		
		def jsonUser = """
			{
			  "id": 120417744,
			  "nickname": "TOYSDEPOT2"		  
			}
		"""
		
		return JSON.parse(jsonUser)
	}

}
