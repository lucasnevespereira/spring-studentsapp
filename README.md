# spring-studentsapp


### Project Files Info
- Api Layer => StudentController
- Business Layer => StudentService
- Data Acces Layer => StudentDAO
  
- Model => Student class


### PostgreSQL commands used

- Installed Postgresql

- In terminal typed ``psql``

- ``\l`` to list databases

- Created database: 
```CREATE DATABASE studentsdb;```
  
- Looked up roles: ```\du``` 
- Grant access to roles: 
  - ``GRANT ALL PRIVILEGES ON DATABASE "studentsdb" TO lucaspereira;``
  - ``GRANT ALL PRIVILEGES ON DATABASE "studentsdb" TO postgres;``

- Connect to database: ``\c studentsdb``

- Look relations: ``\d``


### Connect spring boot to postgres

- Uncomment <b> spring-boot-starter-data-jpa </b> dependecy on <b>pom.xml</b>
- Reload Maven
- Restart app
