# EffortLogger

Effortlogger is an effort estimation tool created to make agile sprints and scrum processes more efficient and easy.

# Important files 📁 -

1. pom.xml -> resolves dependecnies
2. hello-view.fxml -> builds the UI
3. HelloController.java -> Interacts with the event listeners in UI
4. HelloApplication.java -> Combines and runs the application

# EffortLogger so far.. ✅ -

1. We have a working user authentication UI that responds to the user inputs and directs them to the planning poker window if the authentication is successful.
   
2. No database is linked as of now so all the authentication verifications are done using a 2-D array of strings. Username is <ASURITE-ID-WITHOUT-NUMBERS> e.g. 'rsharma' or 'ddiyora' and password is first and lasr name in pascal case (i.e. 'TanayJaiman' or 'DakshDiyora') read in-line comments for more details.
   
3. No implemtations on Planning Poker window so far, only displays 'Planning Poker' as of now but they have been successfully linked to only show on authentication being passed.

# Implementations required (11/12 - Sunday) ⏳ -

1. NEED TO HAVE a linked database to query our list of permitted individuals. 

2. NEED TO HAVE a secure database with appropriate security measures like hashing or Advanced Encryption Standard (AES) to avoid password leakage

3. NEED TO HAVE a defined layout on the Planning Poker window for the Sunday deliverable

# Final deliverable requirements (EOS) ⏰ -

1. Working EffortLogger with Planning Poker support

2. Complete window implementations and Added support for database and appropriate security measures

# How to use 💻 - 

1. Import the files by either ssh-ing into the repository (for this on mac, go to the repository on github and select the code dropdown, copy the ssh and insert into terminal) or downloading and importing the files

2. Run the HelloApplication.java file `javac HelloApplication.java` to compile the file and `/HelloApplication` to run it, if permission errors arise use `chmod +x HelloApplication` and try running again.

3. Most of the work is going to be in hello-view.fxml to build the UI/UX or HelloController.java to interact with the various event listeners.

# Notes 📝 - 

1. Create a branch before any pushes or pulls.
2. Only work in your branch don't push or pull from `origin/main`
3. Within your branch, create as many you want
4. Keep the sensitive data in a seperate file that we put in `.gitignore` so it doesn't upload to github

