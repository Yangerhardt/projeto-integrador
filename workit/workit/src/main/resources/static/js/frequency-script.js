$(document).ready(function() {
    function getCookie(name) {
        let cookies = document.cookie.split(';');
        for(let i = 0; i < cookies.length; i++) {
            let cookie = cookies[i].trim();
            if (cookie.indexOf(name + '=') === 0) {
                return cookie.substring(name.length + 1, cookie.length);
            }
        }
        return null;
    }

    function setCookie(name, value, days) {
        let date = new Date();
        date.setTime(date.getTime() + (days*24*60*60*1000));
        let expires = "expires=" + date.toUTCString();
        document.cookie = name + "=" + value + ";" + expires + ";path=/";
    }

    function updateFrequency() {
        let weeklyFrequency = getCookie('weeklyFrequency') || 0;
        let monthlyFrequency = getCookie('monthlyFrequency') || 0;
        let frequencyDays = JSON.parse(getCookie('frequencyDays') || "[]");

        $("#weekly-frequency").text(`Você frequentou a academia ${weeklyFrequency} vezes nessa semana!`);
        $("#monthly-frequency").text(`Você frequentou a academia ${monthlyFrequency} vezes nesse mês!`);

        $("#frequency-days").empty();
        frequencyDays.forEach(function(day) {
            $("#frequency-days").append(`<li>${day}</li>`);
        });
    }

    updateFrequency();

    $("#frequency-checkbox").on("change", function() {
        if ($("#frequency-checkbox").is(":checked")) {
            let weeklyFrequency = parseInt(getCookie('weeklyFrequency') || 0) + 1;
            let monthlyFrequency = parseInt(getCookie('monthlyFrequency') || 0) + 1;

            let frequencyDays = JSON.parse(getCookie('frequencyDays') || "[]");
            let today = new Date().toLocaleDateString();
            if (!frequencyDays.includes(today)) {
                frequencyDays.push(today);
            }

            setCookie('weeklyFrequency', weeklyFrequency, 7);
            setCookie('monthlyFrequency', monthlyFrequency, 30);
            setCookie('frequencyDays', JSON.stringify(frequencyDays), 30); 

            updateFrequency();
        }
    });
});
