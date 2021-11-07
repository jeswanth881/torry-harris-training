function add() {
    var arr = document.getElementsByName('qty');
    var tot=0;
    for(var i=0;i<arr.length;i++){
        if(parseInt(arr[i].value))
            tot += parseInt(arr[i].value);
    }
    document.getElementById('retail4').value = tot;
}
var doc = new jsPDF();
var specialElementHandlers = {
    '#editor': function (element, renderer) {
        return true;
    }
};
$('#generatePDF').click(function () {
    doc.fromHTML($('#htmlContent').html(), 15, 15, {
        'width': 700,
        'elementHandlers': specialElementHandlers
    });
    doc.save('trainTicket.pdf');
});