# EffortLogger

Effortlogger is an effort estimation tool created to make agile sprints and scrum processes more efficient and easy.

# Important files -

1. pom.xml -> resolves dependecnies
2. hello-view.fxml -> builds the UI
3. HelloController.java -> Interacts with the event listeners in UI
4. HelloApplication.java -> Combines and runs the application

# How to use - 

1. Import the files by either ssh-ing into the repository (for this on mac, go to the repository on github and select the code dropdown, copy the ssh and insert into terminal) or downloading and importing the files

2. Run the HelloApplication.java file `javac HelloApplication.java` to compile the file and `/HelloApplication` to run it, if permission errors arise use `chmod +x HelloApplication` and try running again.

3. Most of the work is going to be in hello-view.fxml to build the UI/UX or HelloController.java to interact with the various event listeners.

# Notes - 

1. Create a branch before any pushes or pulls.
2. Only work in your branch don't push or pull from `origin/main`
3. Within your branch, create as many you want
4. Keep the sensitive data in a seperate file that we put in `.gitignore` so it doesn't upload to github
