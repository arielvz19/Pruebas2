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
		<div id="page-body" role="main">
			<h1>Login</h1>
			<div id="controller-list" role="navigation">
				<g:form controller="user" action="login">
					<div style="width: 300px; margin-bottom: 25px; height: 100px">					
						<label>User:</label> <input type="text" name="userName" style="margin-top: 5px;" />
						<label>Pass:</label> <input type="password" name="password" style="margin-top: 5px;" />
						<label>&nbsp;</label> <input type="submit" value="login" style="float: right; margin-top: 5px;"/>
					</div>
				</g:form>
			</div>
		</div>
	</body>
</html>
