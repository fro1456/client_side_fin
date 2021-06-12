package fileManagement;


import сlasses.Dragon;
import сlasses.RequestedClass;

public class Validation {
    public RequestedClass validation(String[] array) {
        try {

            switch (array[0]) {
                case ("help"):
                    RequestedClass requestedClass = new RequestedClass("help");
                    return requestedClass;
                case ("info"):
                    RequestedClass requestedClass2 = new RequestedClass("info");
                    return requestedClass2;
                case ("show"):
                    RequestedClass requestedClass3 = new RequestedClass("show");
                    return requestedClass3;
                case ("insert"):
                    Dragon dragon = InsertCommand.insert(Integer.parseInt(array[1]));
                    RequestedClass requestedClass4 = new RequestedClass("insert",Long.parseLong(array[1]),dragon);
                    return requestedClass4;
                case ("update_id"):
                    UpdateIdCommand updateIdCommand = new UpdateIdCommand();
                    Dragon d = updateIdCommand.updateId(Long.parseLong(array[1]));
                    RequestedClass requestedClass5 = new RequestedClass("update_id",Long.parseLong(array[1]),d);
                    return requestedClass5;
                case ("remove_key"):
                    RequestedClass requestedClass6 = new RequestedClass("remove_key",Long.parseLong(array[1]));
                    return requestedClass6;
                case ("clear"):
                    RequestedClass requestedClass7 = new RequestedClass("clear");
                    return requestedClass7;
                case ("save"):
                    RequestedClass requestedClass8 = new RequestedClass("save");
                    return requestedClass8;
                case ("exit"):
                    RequestedClass requestedClass9 = new RequestedClass("exit");
                    return requestedClass9;
                case ("execute_script"):
                    RequestedClass requestedClass10 = new RequestedClass("execute_script");
                    return requestedClass10;
                case ("remove_lower"):
                    RequestedClass requestedClass11 = new RequestedClass("remove_lower",Long.parseLong(array[1]));
                    return requestedClass11;
                case ("history"):
                    RequestedClass requestedClass12 = new RequestedClass("history");
                    return requestedClass12;
                case ("replace_if_greater"):
                    RequestedClass requestedClass13 = new RequestedClass("replace_if_greater",Long.parseLong(array[1]));
                    return requestedClass13;
                case ("average_of_age"):
                    RequestedClass requestedClass14 = new RequestedClass("average_of_age");
                    return requestedClass14;
                case ("count_less_than_age"):
                    RequestedClass requestedClass15 = new RequestedClass("count_less_than_age",Long.parseLong(array[1]));
                    return requestedClass15;
                case ("filter_less_than_age"):
                    RequestedClass requestedClass16 = new RequestedClass("filter_less_than_age",Long.parseLong(array[1]));
                    return requestedClass16;
                default:
                    System.err.println("try another command");
            }
        } catch (NumberFormatException e) {
            System.err.println("wrong type");
        }return null;
    }
//    private RequestedClass MakeAnswer(String a){
//        RequestedClass requestedClass= new RequestedClass(a);
//    }
//    private void MakeAnswer(){
//
//    }
}
