Play1.2_Example_JSON
====================

Play Framework 1.2 Example of using JSON/XML with REST in various methods.
Please note, this is example code, proper validation and error checking is not included.


The following REST endpoints are available:

Insert a message with JSON
--------------------------
Insert a message using a HTTP POST with JSON body.

End Point: http://[host][:port]/message  
Example: http://localhost:9000/message  
Method: POST  
Content Type: application/json  
Body: { "room": "room1", "message": "My Message" }  
Response: {"status":"success"}


List of Messages by endpoint extension
--------------------------------------
Get a list of messages using the endpoint extension to determine the response format.

End Point: http://[host][:port]/message/[room].[json/xml/html]  
Example: http://localhost:9000/message/myroom.json  
Method: GET  
Content Type: application/json  


List of Messages in JSON using a template
-----------------------------------------
Get a list of messages in JSON using a Play Groovy Template.

End Point: http://[host][:port]/message/[room]  
Example: http://localhost:9000/message/myroom  
Method: GET  
Content Type: application/json  


List of Messages in JSON without a template
-------------------------------------------
Get a list of messages in JSON without a template.

End Point: http://[host][:port]/messageJSON/[room]  
Example: http://localhost:9000/messageJSON/myroom  
Method: GET  
Content Type: application/json  


List of Messages in XML without a template
-------------------------------------------
Get a list of messages in XML without a template.

End Point: http://[host][:port]/messageXML/[room]  
Example: http://localhost:9000/messageXML/myroom  
Method: GET  
Content Type: application/xml  



