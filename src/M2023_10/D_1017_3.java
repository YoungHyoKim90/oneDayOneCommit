package M2023_10;

public class D_1017_3 {
/*
 * <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

    <style>
        .infinite-line {
            height: 2px; 
            background-image: repeating-linear-gradient(90deg, #000, #000 10px, transparent 10px, transparent 20px);
        }
    </style>
</head>
<body>
    <div class="infinite-line"></div>
    <div>
        <button id="b1" class="btn">Button1</button>
        <button id="b2" class="btn">Button2</button>
        <button id="b3" class="btn">Button3</button>
        <button id="b4" class="btn">Button4</button>
    </div>
    <div class="infinite-line"></div>
    <div>
        <button id="b5" class="btn1">Button5</button>
        <button id="b6" class="btn1">Button6</button>
        <button id="b7" class="btn1">Button7</button>
        <button id="b8" class="btn1">Button8</button>
    </div>
    <div class="infinite-line"></div>
    <div>
        <button id="b9" class="btn2">Button9</button>
        <button id="b10" class="btn2">Button10</button>
        <button id="b11" class="btn2">Button11</button>
        <button id="b12" class="btn2">Button12</button>
    </div>

    <script>
        let clickedButtons = [];
        
        $('.btn').on('click', function () {
            const buttonText = $(this).text();
            clickedButtons.push(buttonText);
            showAlert(clickedButtons);
        });

        const btn1 = document.querySelectorAll('.btn1');
        for (let i = 0; i < btn1.length; i++) {
            btn1[i].addEventListener('click', function () {
                const buttonText = btn1[i].textContent;
                clickedButtons.push(buttonText);
                showAlert(clickedButtons);
            });
        }

        const btn2 = document.querySelectorAll('.btn2');
        for (let i = 0; i < btn2.length; i++) {
            btn2[i].addEventListener('click', function () {
                const buttonText = btn2[i].textContent;
                clickedButtons.push(buttonText);
                showAlert(clickedButtons);
            });
        }

        function showAlert(buttons) {
            if (buttons.length <= 10) {
                alert(`이제까지 누른 버튼들: ${buttons.join(', ')}`);
            } else {
                alert(`이제까지 누른 버튼들: ${buttons.slice(-10).join(', ')}`);
            }
        }
    </script>
</body>
</html>

 */
}
