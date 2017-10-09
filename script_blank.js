var data;
var L;
var map = L.map('map', {
    center: [5, 26],
    zoom: 3,
    minZoom: 2,
    maxZoom: 18
});

L.tileLayer('http://{s}.tiles.mapbox.com/v3/ianmule.bg2v5cdi/{z}/{x}/{y}.png', {attribution: "Mapbox"}).addTo(map);

function basementDweller(feature, layer) { layer.bindPopup("<h1 class='infoHeader'> Hi, I'm an info window</h1><p class='infoHeader'>" + feature.properties.description + "</p>"); 
    } 



L.geoJSON(data, {
    style: function(feature) {
        switch (feature.properties.Name) {
            case 'Wyoming': return {color: "#ffffff"};
            case 'Montana':   return {color: "#ffffff"};
            case 'North Dakota':   return {color: "#ffffff"};
            case 'South Dakota':   return {color: "#ffffff"};
        }
    }
    
}).addTo(map);



L.geoJson(data, {
    
    onEachFeature: basementDweller
    
}).addTo(map);