let chartbox=document.getElementById('myChart').getContext('2d');
        let chart1=new Chart(chartbox,{
            type:'line',
            data:{
                labels:['jan','fab','mar','apl','may','jun','july','aug','sep','oct','nov','dec'],
                datasets:[{
                    label:'Bitcoin Prices in 2021',
                    data:[43.099,42.415,37.998,45.548,35.428,31.350,22.494,20.790,19.270,18.465,19.040,16.633],
                    borderColor:['#000','#000','#000','#000','#000','#000','#000','#000','#000','#000','#000','#000'],
                    borderWidth:1
                }]
            }
        });