# EffortLogger

Effortlogger is an effort estimation tool created to make agile sprints and scrum processes more efficient and easy.

# Important files 📁 -

1. pom.xml -> Resolves dependencies
2. hello-view.fxml -> Builds the UI (Sets the scene for main window)
3. HelloController.java -> Interacts with the event listeners in UI
4. HelloApplication.java -> Combines and runs the application
5. PlanningPoker.fxml -> Sets the scene for the Planning Poker window
6. PlanningPoker.java -> Controller java class to interact with the event listeners in Planning Poker window

# EffortLogger so far.. ✅ -

1. We have a working user authentication UI that responds to the user inputs and directs them to the planning poker window if the authentication is successful.
   
2. Database has been linked to include index (PK), username, hashed password, and the user's role.
   
3. Upon successful authentication, planning poker window is opened that allows users to create a task and enter an estimation for that task.

# Future plans for Implementation -

1. We plan to add more functionalities wherein we allow users to interact with each other to make more accurate estimations on the tasks.

2. Plans to include notifications that notifies user when a new estimation is released to allow another planning poker discussion until the conclusion is reached.

# How to use 💻 - 

1. Import the files by either ssh-ing into the repository (for this on mac, go to the repository on github and select the code dropdown, copy the ssh and insert into terminal) or by downloading and importing the files

2. Run the HelloApplication.java file by using the command `javac HelloApplication.java` to compile the file and `/HelloApplication` to run it, if permission errors arise use `sudo chmod +x HelloApplication` and try running again. Depending on your development environment, you might need to compile other files as well.

3. If the program is not being run, try troubleshooting by using the `-v` flag to step through the compilation process and know where the issues arise.

4. Most of the work is done in hello-view.fxml or PlanningPoker.fxml to build the UI/UX or HelloController.java or PlanningPoker.java to interact with the various event listeners.

# Notes 📝 - 

1. `origin/main` is the main branch where the final files exist.
2. All of the other branches were used by collaborators to allow for efficient development. Thus, any other branch is to be ignored.

