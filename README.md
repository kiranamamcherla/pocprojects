# pocprojects
This repository contains working demo of springsceurity usinf ACL.

Set up this project in eclipse and deploy this WAR to tomcat server. Create db scripts present in sql.txt file in mysql database. 

In this example, database name created is pocprojects.

Once deployed tomcat, start the server.
http://localhost:<port>/<webappname>/login.jsp

Enter admin credentials : Admin and password : secret

Post the news article, delete the news article

Logout and login as user credentials : user1 and password : secret

Post the news article, try for deleting the article posted by admin, will get 403 access forbideen error

Try to delete the news artcile posted by user, it gets deleted
