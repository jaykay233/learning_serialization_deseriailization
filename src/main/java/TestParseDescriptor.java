import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Descriptors;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestParseDescriptor {
    public static void main(String[] args) throws IOException, Descriptors.DescriptorValidationException {
        FileInputStream inputStream = new FileInputStream("src/main/desc/person-all.desc");
        List<Descriptors.FileDescriptor> dependencies = new ArrayList<>();
        DescriptorProtos.FileDescriptorSet fileDescriptorSet = DescriptorProtos.FileDescriptorSet.parseFrom(inputStream);
        for(DescriptorProtos.FileDescriptorProto proto : fileDescriptorSet.getFileList()){
            Descriptors.FileDescriptor fileDescriptor = Descriptors.FileDescriptor.buildFrom(proto,dependencies.toArray(new Descriptors.FileDescriptor[0]),false);
            System.out.println("package = " + fileDescriptor.getPackage());
            System.out.println("name = " + fileDescriptor.getName());
            System.out.println("fullName = " + fileDescriptor.getFullName());
            dependencies.add(fileDescriptor);
            parseFileDescriptor(fileDescriptor);
        }
    }

    private static void parseFileDescriptor(Descriptors.FileDescriptor fileDescriptor) {
        for(Descriptors.Descriptor msgDescriptor : fileDescriptor.getMessageTypes()){
            System.out.println("message Name = " + msgDescriptor.getName());
            System.out.println("message fullName = " + msgDescriptor.getFullName());
            System.out.println("message index = " + msgDescriptor.getIndex());
            parseMessageDescriptor(msgDescriptor);
        }

        for(Descriptors.EnumDescriptor enumDescriptor : fileDescriptor.getEnumTypes()){
            System.out.println("enum name = " + enumDescriptor.getName());
            System.out.println("enum fullName = " + enumDescriptor.getFullName());
            System.out.println("enum index = " + enumDescriptor.getIndex());
            parseEnumDescriptor(enumDescriptor);
        }
    }

    private static void parseMessageDescriptor(Descriptors.Descriptor msgDescriptor) {
        for(Descriptors.FieldDescriptor fieldDescriptor : msgDescriptor.getFields()){
            System.out.println("field name = " + fieldDescriptor.getName());
            System.out.println("field fullName = " + fieldDescriptor.getFullName());
            System.out.println("field index = " + fieldDescriptor.getIndex());
            System.out.println("field type = " + fieldDescriptor.getType().name());
        }
    }

    private static void parseEnumDescriptor(Descriptors.EnumDescriptor enumDescriptor){
        for(Descriptors.EnumValueDescriptor enumValueDescriptor : enumDescriptor.getValues()){
            System.out.println("enum value name = " + enumValueDescriptor.getName());
            System.out.println("enum value fullName = " + enumValueDescriptor.getFullName());
            System.out.println("enum value index = " + enumValueDescriptor.getIndex());
            System.out.println("enum value number = " + enumValueDescriptor.getNumber());
        }
    }
}
