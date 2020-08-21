package com.nicollefavero.pokemoncatcher;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

import static java.nio.file.StandardWatchEventKinds.*;

public class PokemonCatcher {

    private static final String POKEMONS_PATH = "/home/ilegra-237/Documentos/java-beginner/pokemon-catcher/pokemons";

    public static void main(String[] args) throws IOException, InterruptedException {

        WatchService watchService = FileSystems.getDefault().newWatchService();
        Path path = Paths.get(POKEMONS_PATH);
        path.register(watchService, ENTRY_CREATE, ENTRY_MODIFY, ENTRY_DELETE);

        boolean poll = true;
        while(poll){
            WatchKey key = watchService.take();
            for(WatchEvent event : key.pollEvents()){
                System.out.println("Event kind : " + event.kind() + " - Pokemon : " + event.context().toString().toLowerCase());
            }

            poll = key.reset();
        }

    }
}
