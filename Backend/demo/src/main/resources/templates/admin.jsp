<!DOCTYPE html>
<html>
<head>
    <title>Admin Page</title>
</head>
<body>
    <h1>Add Flight</h1>
    <form action="/admin/add-flight" method="post">
        <label for="departureLocation">Departure Location:</label>
        <input type="text" id="departureLocation" name="departureLocation" required><br>

        <label for="departureDateTime">Departure Date and Time:</label>
        <input type="text" id="departureDateTime" name="departureDateTime" required><br>

        <label for="destinationLocation">Destination Location:</label>
        <input type="text" id="destinationLocation" name="destinationLocation" required><br>

        <label for="destinationDateTime">Destination Date and Time:</label>
        <input type="text" id="destinationDateTime" name="destinationDateTime" required><br>

        <label for="price">Price:</label>
        <input type="number" id="price" name="price" step="0.01" required><br>

        <input type="submit" value="Add Flight">
    </form>
</body>
</html>
