# Creating a dictionary
student = {
    "name": "Raj",
    "age": 20,
    "grade": "A"
}

# Printing dictionary
print("Dictionary:", student)

# Accessing values
print("Name:", student["name"])
print("Age:", student["age"])

# Adding new key-value
student["city"] = "Pune"

# Updating value
student["age"] = 21

# Removing key
del student["grade"]

print("Updated Dictionary:", student)
