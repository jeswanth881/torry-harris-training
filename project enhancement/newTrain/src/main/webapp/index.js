function fun() {
    var no = document.getElementById("hii").value;
    var line1=document.createElement("hr");
    if(no>9){
        alert("Maximum limit reached");
        window.location.reload();
    }
    for(var i=1;i<=no;i++) {
        var textfield = document.createElement("input");
        document.head.innerHTML += `
        <style>
		 input{
            float: left;
            color: black;
            text-align: center;
            padding: 12px;
            text-decoration: none;
            font-size: 18px;
            line-height: 25px;
            border-radius: 4px;
            background-color: dodgerblue;
            color: white;
        }

        

        input:hover {
            background-color: #ddd;
            color: black;
        }

       
        </style>`;
        var fullName = document.createElement("input");
        fullName.name = "fullName";
        fullName.type = "text";
        fullName.placeholder="Enter Passenger "+i+" Name";
        document.getElementById('form'+i+'').appendChild(fullName);

        var age = document.createElement("input");
        age.name = "age";
        age.type = "number";
        age.placeholder="Enter Passenger "+i+" Age";
        document.getElementById('form'+i+'').appendChild(age);

        var gender = document.createElement("input");
        gender.name = "gender";
        gender.type = "text";
        gender.placeholder="Enter Passenger "+i+" Gender (M/F)";
        document.getElementById('form'+i+'').appendChild(gender);
    }
    var line=document.createElement("br");
    document.getElementById("line").appendChild(line);
    document.getElementById("line1").appendChild(line);
    document.getElementById("line2").appendChild(line);
}