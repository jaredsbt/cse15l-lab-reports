# LabReport1

# `cd`
1) Path: [user@sahara ~/lecture1/messages] .  `cd` without arguments takes user to root directory. No errors. Ex) `[user@sahara ~/lecture1/messages]$ cd`
2) Path: [user@sahara ~/lecture1]$ cd messages/ . `cd` with directory argument changes directory to the specified directory. No errors. Ex) `[user@sahara ~/lecture1]$ cd messages/`
3) Path: [user@sahara ~/lecture1] . `cd` with file path arguments gives an error as it is not a directory. Ex) `[user@sahara ~/lecture1]$ cd messages/ar-lb.txt --> bash: cd: messages/ar-lb.txt: Not a directory`

# `ls`
1) Path: [user@sahara ~/lecture1] . `ls` without arguments gives user a list of files and folders (objects) within the current directory. No errors. Edstem highlights listed directories in blue Ex)  `[user@sahara ~/lecture1]$ ls
Hello.class  Hello.java  messages  README`
2) Path: [user@sahara ~/lecture1] . `ls` with directory argument gives user a list of files and folers (objects) within the specificed directory. No errors. Edstem highlights listed directories in blue Ex) `[user@sahara ~/lecture1]$ ls messages/
ar-lb.txt  en-us.txt  es-mx.txt  zh-cn.txt` 
3) Path: [user@sahara ~/lecture1] . `ls` with file path argument gives the file pathway. No errors. Ex) `[user@sahara ~/lecture1]$ ls messages/ar-lb.txt 
messages/ar-lb.txt`

# `cat`
1) Path: [user@sahara ~/lecture1/messages] .  `cat` without arguments makes a new line and waits for a correct input but does not give an erorr. Ex) `[user@sahara ~/lecture1/messages]$ cat
ar-lb.txt
ar-lb.txt
`
2) Path: [user@sahara ~/lecture1] .  `cat` with directory argument gives an error because cat requires a file argument not a directory. Ex) `[user@sahara ~/lecture1]$ cat messages/
cat: messages/: Is a directory`
3) Path: [user@sahara ~/lecture1] . `cat` with file path argument prints the file's contents. No errors. Ex) `[user@sahara ~/lecture1]$ cat messages/ar-lb.txt 
مرحبا بالعالم!`
