# Define function to calculate sum
def calculateSum(num):
  if num:
    # Recursive function call
    return num + calculateSum(num-1)
  else:
    return 0

# Call calculateSum() function
recNum = int(input("Please Enter the number "))
res = calculateSum(recNum)

# Print result
print(res)