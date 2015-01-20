package ApiRestServices

import grails.converters.JSON
import org.codehaus.groovy.grails.web.json.JSONObject

class APIItemsServiceMock {

	def resultItems = """
		[{
		  "id": "MLB588228187",
		  "title": "item 01",
		  "thumbnail": "http://mlb-s2-p.mlstatic.com/18883-MLB20162167108_092014-I.jpg"
		},
		{
		  "id": "MLA539151655",
		  "title": "Item 02",
		  "thumbnail": "http://mla-s1-p.mlstatic.com/18452-MLA20155899044_092014-I.jpg"
		    
		}]
	"""
	
	def getItems (userId) {
		return JSON.parse(resultItems)
	}
}
