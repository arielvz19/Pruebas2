<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Prueba Viernes 16</title>
		<style type="text/css" media="screen">
			#page-body {
				margin: 2em 1em 1.25em 18em;
			}

			h2 {
				margin-top: 1em;
				margin-bottom: 0.3em;
				font-size: 1em;
			}

			p {
				line-height: 1.5;
				margin: 0.25em 0;
			}

			#controller-list ul {
				list-style-position: inside;
			}

			#controller-list li {
				line-height: 1.3;
				list-style-position: inside;
				margin: 0.25em 0;
			}
			
			
				#page-body label {
					float: left;
					width: 65px;
					margin-top: 5px;
				}
		</style>
	</head>
	<body>		
		<div  id="page-header">
		 
		</div>
		<div id="page-body" role="main">
			<h1>User Data</h1>
			<div id="controller-list" role="navigation">
				
					<g:if test="${userInstance?.nickname}">
					<div class="fieldcontain">
						<span class="property-value">Usuario: <span>${userInstance.nickname}</span></span> 					
					</div>
					</g:if>
			</div>
			<div id="Items-list">
				<table>
					<thead>
						<tr>
							<td>ID</td>
							<td>Título</td>
							<td>Imagen</td>
						</tr>
					</thead>
					<tbody>
						<g:each in="${itemList}" status="i" var="itemInstance">
							<tr>
							
								<td>${fieldValue(bean: itemInstance, field: "idData")}</td>
								
								<td>${fieldValue(bean: itemInstance, field: "title")}</td>
								
								<td><img src="${fieldValue(bean: itemInstance, field: "image")}" /></td>
							
							</tr>
						</g:each>
					</tbody>
				</table>
			</div>
		</div>
	</body>
</html>
