# TMPlay

The core focus of this project is to be a Task Management Application.

The inception of this project came about as I researched various topics regarding system design. I gathered conceptual knowledge from various domains, such as networking, distributed systems, etc., but lacked technical application. Rather than (re)build a project for each concept I wanted to implement and measure, I decided to create this small project that will provide a foundation for simulating different scenarios. I should be able to fork from here whenever I need a clean branch. 

Currently, I am working on fleshing out what a task manager does. Not to be confused with a job scheduler, this will mimic the behaviour of users that manage projects – Project Manager would have been a suitable choice, but I'd have to explain the nuance between that and the role. I will leave it as is for all intents and purposes.

The technologies that I've chosen to use as of (6/10) are:
   
    - Java 17
      - Spring Boot
    - H2 RDBMS
    - Gradle

Phase 1: Create a task manager with basic functionality for a single user.
  - User can create a task with minimal information.
  - User can retrieve all tasks with no differentiation.
  - User can edit a task.
  - Data is stored in embedded H2 DB and loaded upon boot with .sql files.
  - TDD includes unit testing for helper functions and Spring Boot components.

Post-Phase 1 / Pre-Phase 2:
  - Sanitize and validate user input
  - Create logging and storage for user
  - Decide alternative databases

Phase 2:
  - Add basic performance metrics
  - Different models of tasks can be resolved (obeying the SOLID)
  - Multiple users can use the database with LPU access.
  - Users can form groups that grant access to shared tasks.
 
Phase 3: TBD


I hope to get this to a stage where I can test the performance of different distributed scenarios and test some network concepts. 
