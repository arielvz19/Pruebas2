import grails.util.Environment
import ApiRestServices.APIUserService
import ApiRestServices.ApiUserServiceMock
import ApiRestServices.APIItemsService
import ApiRestServices.APIItemsServiceMock

beans = {
	switch(Environment.current) {
		case Environment.PRODUCTION:
			apiUserService(APIUserService)
			apiItemsService(APIItemsService) 
			break

		case Environment.DEVELOPMENT:
			apiUserService(ApiUserServiceMock)
			apiItemsService(APIItemsServiceMock) 
			break
	}
}
