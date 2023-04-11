# ExceptionHandling
To use Spring boot Exception Handling, Bean Validation, Lombok , H2 database, spring data JPA and create a rest API

URI for post:  http://localhost:9292/users/fetchAll   

JSON PAYLOAD for Post note validations are added to individual parameters

{
	"name":"",
	"emailId":"@gmail.com",
	"mobile": "299",
	"age": 300,
	"gender": "M",
   "nationality": null 
}

URI for GET http://localhost:9292/users/fetchAll 
            http://localhost:9292/users/1
            
in memory h2 database is used to creat the API

1.Import Project
2.Maven Update
3.Maven Build clean install
4.Run as java application
