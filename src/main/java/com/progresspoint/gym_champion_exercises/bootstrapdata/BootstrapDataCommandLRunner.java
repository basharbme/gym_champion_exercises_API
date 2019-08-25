package com.progresspoint.gym_champion_exercises.bootstrapdata;

import com.progresspoint.gym_champion_exercises.model.BodyPart;
import com.progresspoint.gym_champion_exercises.model.Exercise;
import com.progresspoint.gym_champion_exercises.model.Muscle;
import com.progresspoint.gym_champion_exercises.model.enums.BodyPosition;
import com.progresspoint.gym_champion_exercises.model.enums.Equipment;
import com.progresspoint.gym_champion_exercises.model.enums.PushPullcheme;
import com.progresspoint.gym_champion_exercises.repository.BodyPartRepository;
import com.progresspoint.gym_champion_exercises.repository.ExerciseRepository;
import com.progresspoint.gym_champion_exercises.repository.MuscleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class BootstrapDataCommandLRunner implements CommandLineRunner {

    private final BodyPartRepository bodyPartRepository;
    private final ExerciseRepository exerciseRepository;
    private final MuscleRepository muscleRepository;

    public BootstrapDataCommandLRunner(BodyPartRepository bodyPartRepository, ExerciseRepository exerciseRepository, MuscleRepository muscleRepository) {
        this.bodyPartRepository = bodyPartRepository;
        this.exerciseRepository = exerciseRepository;
        this.muscleRepository = muscleRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        loadData();
    }

    private void loadData() {

        // Body Parts init
        Optional<BodyPart> armsBPOptional = bodyPartRepository.findByName("Arms");
        if(!armsBPOptional.isPresent()){
            throw new RuntimeException("Expected Body Part not in data base");
        }
//        bodyPartRepository.save(armsBPOptional.get());

        Optional<BodyPart> foreArmsBPOptional = bodyPartRepository.findByName("Forearms");
        if(!foreArmsBPOptional.isPresent()){
            throw new RuntimeException("Expected Body Part not in data base");
        }

        Optional<BodyPart> shouldersArmsBPOptional = bodyPartRepository.findByName("Shoulders");
        if(!shouldersArmsBPOptional.isPresent()){
            throw new RuntimeException("Expected Body Part not in data base");
        }

        Optional<BodyPart> neckBPOptional = bodyPartRepository.findByName("Neck");
        if(!neckBPOptional.isPresent()){
            throw new RuntimeException("Expected Body Part not in data base");
        }

        Optional<BodyPart> backBPOptional = bodyPartRepository.findByName("Back");
        if(!backBPOptional.isPresent()){
            throw new RuntimeException("Expected Body Part not in data base");
        }

        Optional<BodyPart> chestBPOptional = bodyPartRepository.findByName("Chest");
        if(!chestBPOptional.isPresent()){
            throw new RuntimeException("Expected Body Part not in data base");
        }

        Optional<BodyPart> absBPOptional = bodyPartRepository.findByName("Abs");
        if(!absBPOptional.isPresent()){
            throw new RuntimeException("Expected Body Part not in data base");
        }

        Optional<BodyPart> glutesBPOptional = bodyPartRepository.findByName("Glutes");
        if(!glutesBPOptional.isPresent()){
            throw new RuntimeException("Expected Body Part not in data base");
        }

        Optional<BodyPart> hamsBPOptional = bodyPartRepository.findByName("Hams");
        if(!hamsBPOptional.isPresent()){
            throw new RuntimeException("Expected Body Part not in data base");
        }

        Optional<BodyPart> quadsBPOptional = bodyPartRepository.findByName("Quads");
        if(!quadsBPOptional.isPresent()){
            throw new RuntimeException("Expected Body Part not in data base");
        }

        Optional<BodyPart> calvesBPOptional = bodyPartRepository.findByName("Calves");
        if(!calvesBPOptional.isPresent()){
            throw new RuntimeException("Expected Body Part not in data base");
        }
        
        // Muscles init

        Optional<Muscle> bicepsLHMusclesOptional = muscleRepository.findByName("Biceps. Long Head");
        if(!bicepsLHMusclesOptional.isPresent()){
            throw new RuntimeException("No such muscle in data base");
        }
        muscleRepository.save(bicepsLHMusclesOptional.get());

        Optional<Muscle> bicepsSHMusclesOptional = muscleRepository.findByName("Biceps. Short Head");
        if(!bicepsSHMusclesOptional.isPresent()){
            throw new RuntimeException("No such muscle in data base");
        }

        Optional<Muscle> tricpsLHMusclesOptional = muscleRepository.findByName("Triceps. Long Head");
        if(!tricpsLHMusclesOptional.isPresent()){
            throw new RuntimeException("No such muscle in data base");
        }

        Optional<Muscle> tricpsLatHMusclesOptional = muscleRepository.findByName("Triceps. Lateral Head");
        if(!tricpsLatHMusclesOptional.isPresent()){
            throw new RuntimeException("No such muscle in data base");
        }

        Optional<Muscle> tricpsMHMusclesOptional = muscleRepository.findByName("Triceps. Medial Head");
        if(!tricpsMHMusclesOptional.isPresent()){
            throw new RuntimeException("No such muscle in data base");
        }

        Optional<Muscle> forearmsFlexMusclesOptional = muscleRepository.findByName("Forearms. Flexors");
        if(!forearmsFlexMusclesOptional.isPresent()){
            throw new RuntimeException("No such muscle in data base");
        }

        Optional<Muscle> forearmsExtMusclesOptional = muscleRepository.findByName("Forearms. Extensors");
        if(!forearmsExtMusclesOptional.isPresent()){
            throw new RuntimeException("No such muscle in data base");
        }

        Optional<Muscle> deltsAHMusclesOptional = muscleRepository.findByName("Deltoids. Anterior Head");
        if(!deltsAHMusclesOptional.isPresent()){
            throw new RuntimeException("No such muscle in data base");
        }

        Optional<Muscle> deltsMHMusclesOptional = muscleRepository.findByName("Deltoids. Medial Head");
        if(!deltsMHMusclesOptional.isPresent()){
            throw new RuntimeException("No such muscle in data base");
        }

        Optional<Muscle> deltsPHMusclesOptional = muscleRepository.findByName("Deltoids. Posterior Head");
        if(!deltsPHMusclesOptional.isPresent()){
            throw new RuntimeException("No such muscle in data base");
        }

        Optional<Muscle> trapesiusUpMusclesOptional = muscleRepository.findByName("Upper Trapesius");
        if(!trapesiusUpMusclesOptional.isPresent()){
            throw new RuntimeException("No such muscle in data base");
        }

        Optional<Muscle> trapesiusMiddMusclesOptional = muscleRepository.findByName("Middle Trapesius");
        if(!trapesiusMiddMusclesOptional.isPresent()){
            throw new RuntimeException("No such muscle in data base");
        }

        Optional<Muscle> trapesiusLowMusclesOptional = muscleRepository.findByName("Lower Trapesius");
        if(!trapesiusLowMusclesOptional.isPresent()){
            throw new RuntimeException("No such muscle in data base");
        }

        Optional<Muscle> latissimusDorsiMusclesOptional = muscleRepository.findByName("Latissimus Dorsi");
        if(!latissimusDorsiMusclesOptional.isPresent()){
            throw new RuntimeException("No such muscle in data base");
        }

        Optional<Muscle> upperChestMusclesOptional = muscleRepository.findByName("Upper Chest");
        if(!upperChestMusclesOptional.isPresent()){
            throw new RuntimeException("No such muscle in data base");
        }

        Optional<Muscle> middleChestMusclesOptional = muscleRepository.findByName("Middle Chest");
        if(!middleChestMusclesOptional.isPresent()){
            throw new RuntimeException("No such muscle in data base");
        }

        Optional<Muscle> lowerChestMusclesOptional = muscleRepository.findByName("Lower Chest");
        if(!lowerChestMusclesOptional.isPresent()){
            throw new RuntimeException("No such muscle in data base");
        }

        Optional<Muscle> absMusclesOptional = muscleRepository.findByName("Abs");
        if(!absMusclesOptional.isPresent()){
            throw new RuntimeException("No such muscle in data base");
        }

        Optional<Muscle> gluteusMusclesOptional = muscleRepository.findByName("Gluteus");
        if(!gluteusMusclesOptional.isPresent()){
            throw new RuntimeException("No such muscle in data base");
        }

        Optional<Muscle> hamstringsMusclesOptional = muscleRepository.findByName("Hamstrings");
        if(!hamstringsMusclesOptional.isPresent()){
            throw new RuntimeException("No such muscle in data base");
        }

        Optional<Muscle> quadsMusclesOptional = muscleRepository.findByName("Quads");
        if(!quadsMusclesOptional.isPresent()){
            throw new RuntimeException("No such muscle in data base");
        }

        Optional<Muscle> calvesMusclesOptional = muscleRepository.findByName("Calves");
        if(!calvesMusclesOptional.isPresent()){
            throw new RuntimeException("No such muscle in data base");
        }

        Exercise dumbbellBicepsCurlStanding = new Exercise();
        dumbbellBicepsCurlStanding.setName("Dumbbell_BicepsCurl_Standing");
        dumbbellBicepsCurlStanding.setEquipment(Equipment.DUMBBELL);
        dumbbellBicepsCurlStanding.setPushPullcheme(PushPullcheme.PULL);
        dumbbellBicepsCurlStanding.setBodyPosition(BodyPosition.STANDING);
        Set<BodyPart> dumbbellBicepsCurlStandingBodyPartSet = new HashSet<>();
        dumbbellBicepsCurlStandingBodyPartSet.add(armsBPOptional.get());
        dumbbellBicepsCurlStanding.setBodyParts(dumbbellBicepsCurlStandingBodyPartSet);
        Set<Muscle> dumbbellBicepsCurlStandingMuscleSet = new HashSet<>();
        dumbbellBicepsCurlStandingMuscleSet.add(bicepsLHMusclesOptional.get());
        dumbbellBicepsCurlStandingMuscleSet.add(bicepsSHMusclesOptional.get());
        dumbbellBicepsCurlStanding.setMuscles(dumbbellBicepsCurlStandingMuscleSet);
        exerciseRepository.save(dumbbellBicepsCurlStanding);


        Exercise barbellCurl = new Exercise();
        barbellCurl.setName("Barbell_Curl");
        barbellCurl.setEquipment(Equipment.BARBELL);
        barbellCurl.setPushPullcheme(PushPullcheme.PULL);
        barbellCurl.setBodyPosition(BodyPosition.STANDING);
        Set<BodyPart> barBellBodyPartsSet = new HashSet<>();
        barBellBodyPartsSet.add(armsBPOptional.get());
        barbellCurl.setBodyParts(barBellBodyPartsSet);
        Set<Muscle> barBellMuscleSet = new HashSet<>();
        barBellMuscleSet.add(bicepsLHMusclesOptional.get());
        barBellMuscleSet.add(bicepsSHMusclesOptional.get());
        barbellCurl.setMuscles(barBellMuscleSet);
        exerciseRepository.save(barbellCurl);



    }

}
