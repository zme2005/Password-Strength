# 🔐 Password Strength Checker

This is a simple Java console application that checks the strength of a user-provided password. It validates the password against the following criteria:

- ✅ At least one uppercase letter
- ✅ At least one lowercase letter
- ✅ At least one digit
- ✅ At least one special character
- ❌ No spaces allowed
- ✅ Minimum length of 8 characters

After validation, the program assigns a strength score and a descriptive rating:

- 0 criteria met → Very Weak  
- 1 criterion met → Weak  
- 2 criteria met → Very Weak  
- 3 criteria met → Moderate  
- 4 criteria met → Strong  
- 5 criteria met → Very Strong  

## 💻 How to Run

Make sure you have Java installed. Then:

```bash
javac Main.java
java Main
