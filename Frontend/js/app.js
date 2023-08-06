
let StudentTable = document.getElementById("tbl-student");

fetch("http://localhost:8080/get-student")
.then(response => response.json())
.then(res => {

    let tblBody = `<tr>
                    <td>Student Name</td>
                    <td>Last Name</td>
                    </tr>`

    res.forEach(element => {
        
        tblBody += `<tr>
                    <td>${element.firstName}</td>
                    <td>${element.lastName}</td>
                    </tr>`
    });

    StudentTable.innerHTML = tblBody;

})