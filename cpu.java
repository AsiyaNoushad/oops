public class cpu {
    public static void main(String[] args) {
        CPU cpu = new CPU(200);
        System.out.println(cpu.getProcessorInfo());
        System.out.println(cpu.getRAMInfo());
    }
}
class CPU {
    private int price;
    public class Processor {
        private int noOfCores;
        private String manufacturer;
        public Processor(int noOfCores, String manufacturer) {
            this.noOfCores = noOfCores;
            this.manufacturer = manufacturer;
        }
    }
    public static class RAM {
        private int memory;
        private String manufacturer;
        public RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }
    }
    public CPU(int price) {
        this.price = price;
    }
    public Processor processor = new Processor(4, "Intel");
    public String getProcessorInfo() {
        return "Processor: " + processor.noOfCores + " cores, Manufacturer: " + processor.manufacturer;
    }
    public String getRAMInfo() {
        return "RAM: " + new RAM(8, "Samsung").memory + " GB, Manufacturer: " + new RAM(8, "Samsung").manufacturer;
    }
}
