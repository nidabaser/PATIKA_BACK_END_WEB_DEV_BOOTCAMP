## Zoo Management System

Design a system to track information about animals in a zoo.

- Animals: Animals are characterized by groups such as
- Horses (horses, zebras, donkeys, etc.),
- Cats (tigers, lions, etc.),
- Rodents (rats, beavers, etc.).

Most of the information stored about animals is the same for all groupings. species name, weight, age, etc.

- The system should also be able to retrieve the dosage of specific medications for each animal => getDosage()
- The system should be able to calculate feeding times => getFeedSchedule()

The logic for performing these functions will be different for each grouping. For example, the feeding algorithm for horses will be different from that for tigers.

Using the polymorphism model, design a class diagram to address the scenario described above.