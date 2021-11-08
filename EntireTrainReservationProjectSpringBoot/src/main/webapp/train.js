$('#NumberOfPassengers').on('input',function(e){
    $('#content').html('');
    var val=$(this).val();
    for(let i = 1; i <= val; i++){
        $('#content').append('<div>'+'<br><label for="name">Name:</label>'+
            '<input type="text" name="name'+i+'" id="name" class="trainInput" placeholder="Name" required>'+
            '<label for="age">Age:</label>'+
            '<input type="number" name="age'+i+'" id="age" class="trainInput" placeholder="Age" required>'+
            '<label for="gender" >Gender:&emsp;</label>'+
            '<select name="gender'+i+'" id="gender" required>'+
            '<option value="">select</option>'+
            '<option value="M">Male</option>'+
            '<option value="F">Female</option>'+
            '</select>'+'</div>');
    }

});