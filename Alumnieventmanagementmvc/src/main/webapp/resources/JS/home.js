document.addEventListener("DOMContentLoaded", function() {
    // Toggle Sidebar on Button Click
    document.querySelector('.navbar-toggler').addEventListener('click', function() {
        document.getElementById('sidebar').classList.toggle('active');
    });

    // Show alert message if present
    var alertMsg = document.getElementById("alertMsg");
    if (alertMsg.innerHTML.trim() !== "") {
        alertMsg.style.display = "block";
        setTimeout(function() {
            alertMsg.style.display = "none";
        }, 3000);
    }
});
