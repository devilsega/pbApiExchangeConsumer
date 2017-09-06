$('#datetimepicker').datetimepicker({
    locale: 'ru',
    format: 'L',
    maxDate: moment()
});

$('#btn-submit').click( function() {
    var val = $('#datetimepicker').val();
    location.href = "history?date="+val;
});