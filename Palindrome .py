s = input(" Please type in a word")   # Inputting a word because freedom of choice.
def palindrome(s):      #Created the method palindrome
    J = s.replace(" ", "") # Replacing the spaces within the word 
    Lower = J.lower()  # Any word the user inputs it will return as lowercase to not mess up the process
    Replacer = Lower[::-1]  # Assigned variable to make the word appear backwards  
    
  
    if( Lower == Replacer):
        return True
    else: return False

print(palindrome(s))  


