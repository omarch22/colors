package com.cols.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class ColsCnt {

    @GetMapping("/tablas")
    public String tablas(Model model){

        List<Map<String,String>> tabs=new ArrayList<>();

        tabs.add(tab("nombre","Nombre","Omar","false"));
        tabs.add(tab("edad","Edad","20 años","false"));
        tabs.add(tab("comida","Comida fav","Alitas","false"));

        tabs.add(tab("carro","Carro","Ninguno ;(","true"));
        tabs.add(tab("marca","Marca fav","Apple","true"));
        tabs.add(tab("cancion","Canción fav","Possibly Maybe","true"));
        tabs.add(tab("artista","Artista fav","Rosalía","true"));
        tabs.add(tab("promedio","Promedio","9.2","true"));
        tabs.add(tab("asi","Asi","Fonyu","true"));
        tabs.add(tab("signo","Signo","Cancer","true"));
        tabs.add(tab("gen","Genero","Masculino","true"));
        tabs.add(tab("hols","Hola","Como estas","true"));
        tabs.add(tab("des","Desarrollo","Basado en Plataformas","true"));

        model.addAttribute("titulo","OMAR PEREDA");
        model.addAttribute("tabs",tabs);
        model.addAttribute("mostrarRoja",true);

        return "tablas";
    }

    private Map<String,String> tab(String id,String categoria,String valor,String dropdown){
        Map<String,String> m=new HashMap<>();
        m.put("id",id);
        m.put("categoria",categoria);
        m.put("valor",valor);
        m.put("dropdown",dropdown);
        return m;
    }
}