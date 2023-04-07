import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hospital {
    
    static List<Patient> patients = new ArrayList<Patient>();
    static List<Doctor> doctors = new ArrayList<Doctor>();
    static List<Appointment> appointments = new ArrayList<Appointment>();
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;
        
        // Adding some sample data for demonstration purposes
        doctors.add(new Doctor("Dr. John Doe", "Cardiology", "9876543210"));
        doctors.add(new Doctor("Dr. Jane Smith", "Pediatrics", "9876543211"));
        patients.add(new Patient("John", "Doe", "01/01/1980", "M", "johndoe@gmail.com", "9876543210"));
        patients.add(new Patient("Jane", "Smith", "02/02/1985", "F", "janesmith@gmail.com", "9876543211"));
        
        do {
            System.out.println("\nWelcome to the Medical App!");
            System.out.println("1. Book an appointment");
            System.out.println("2. View your appointments");
            System.out.println("3. Update personal information");
            System.out.println("4. Exit");
            System.out.print("Enter your option: ");
            option = input.nextInt();
            
            switch(option) {
                case 1:
                    bookAppointment();
                    break;
                case 2:
                    viewAppointments();
                    break;
                case 3:
                    updatePersonalInfo();
                    break;
                case 4:
                    System.out.println("\nThank you for using the Medical App!");
                    break;
                default:
                    System.out.println("\nInvalid option. Please try again.");
            }
            
        } while(option != 4);
    }
    
    // Method to book a new appointment
    public static void bookAppointment() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nBook an Appointment");
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter your date of birth (MM/DD/YYYY): ");
        String dob = input.nextLine();
        System.out.print("Enter your gender (M/F): ");
        String gender = input.nextLine();
        System.out.print("Enter your email address: ");
        String email = input.nextLine();
        System.out.print("Enter your phone number: ");
        String phone = input.nextLine();
        Patient patient = new Patient(firstName, lastName, dob, gender, email, phone);
        
        System.out.println("\nChoose a Doctor");
        int i = 1;
        for(Doctor d : doctors) {
            System.out.println(i + ". " + d.getName() + " (" + d.getSpecialization() + ")");
            i++;
        }
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        Doctor doctor = doctors.get(choice - 1);
        
        System.out.print("Enter the date of appointment (MM/DD/YYYY): ");
        String date = input.next();
        System.out.print("Enter the time of appointment (HH:MM AM/PM): ");
        String time = input.next();
        Appointment appointment = new Appointment(patient, doctor, date, time);
        appointments.add(appointment);
        
        System.out.println("\nAppointment booked successfully! Details:");
        System.out.println(appointment.toString());
    }
    
    // Method to view all appointments
}// Method to view all appointments of a patient
public static void viewAppointments() {
    Scanner input = new Scanner(System.in);
    System.out.println("\nView Appointments");
    System.out.print("Enter your email address: ");
    String email = input.nextLine();
    
    boolean found = false;
    for(Patient p : patients) {
        if(p.getEmail().equals(email)) {
            found = true;
            List<Appointment> patientAppointments = new ArrayList<Appointment>();
            for(Appointment a : appointments) {
                if(a.getPatient().equals(p)) {
                    patientAppointments.add(a);
                }
            }
            if(patientAppointments.size() == 0) {
                System.out.println("\nNo appointments found for the patient.");
            } else {
                System.out.println("\nAppointments for the patient:");
                for(Appointment a : patientAppointments) {
                    System.out.println(a.toString());
                }
            }
            break;
        }
    }
    
    if(!found) {
        System.out.println("\nPatient not found with the given email address.");
    }
}

// Method to update personal information
public static void updatePersonalInfo() {
    Scanner input = new Scanner(System.in);
    System.out.println("\nUpdate Personal Information");
    System.out.print("Enter your email address: ");
    String email = input.nextLine();
    
    boolean found = false;
    for(Patient p : patients) {
        if(p.getEmail().equals(email)) {
            found = true;
            System.out.println("\nCurrent Information:");
            System.out.println(p.toString());
            System.out.print("Enter your new first name (press enter to keep current value): ");
            String firstName = input.nextLine();
            if(!firstName.isEmpty()) {
                p.setFirstName(firstName);
            }
            System.out.print("Enter your new last name (press enter to keep current value): ");
            String lastName = input.nextLine();
            if(!lastName.isEmpty()) {
                p.setLastName(lastName);
            }
            System.out.print("Enter your new date of birth (MM/DD/YYYY) (press enter to keep current value): ");
            String dob = input.nextLine();
            if(!dob.isEmpty()) {
                p.setDob(dob);
            }
            System.out.print("Enter your new gender (M/F) (press enter to keep current value): ");
            String gender = input.nextLine();
            if(!gender.isEmpty()) {
                p.setGender(gender);
            }
            System.out.print("Enter your new phone number (press enter to keep current value): ");
            String phone = input.nextLine();
            if(!phone.isEmpty()) {
                p.setPhone(phone);
            }
            System.out.println("\nPersonal information updated successfully! Updated information:");
            System.out.println(p.toString());
            break;
        }
    }
    
    if(!found) {
        System.out.println("\nPatient not found with the given email address.");
    }
}
}