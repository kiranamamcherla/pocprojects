# pocprojects
This repository contains working demo of Spring Security using ACL.

Set up this project in Eclipse and deploy this WAR to any Web Server like Tomcat. Create db scripts present in sql.txt file in MySQL database. 

In this example, database name created is pocprojects.

Once deployed to Tomcat, start the server.
http://localhost:<port>/<webappname>/login.jsp

Enter Admin Credentials user id : Admin and password : secret

Application will be launched with a screen for posting the News Article.

Once News Article is posted, there is a provision for deleting where delete link gets displayed.

Try to delete the article posted by user or admin, article gets deleted.

Logout from Admin and login with user credentials user id : user1 and password : secret

Post the news article, try for deleting the article posted by admin, will get 403 access forbidden error

Try to delete the news artcile posted by user, it gets deleted
