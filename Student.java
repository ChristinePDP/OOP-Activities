      class Student extends Person {
          private String Program;
          private Integer Year;
      
          public Student(String name, String address, String program, Integer year) {
              super();
              this.Name = name;
              this.Address = address;
              this.Program = program;
              this.Year = year;
          }
      
          public String getProgram() {
              return this.Program;
          }
      
          public Integer getYear() {
              return this.Year;
          }

          @Override
          public String toString(){
                    return "Hello I am " + Name + " I lived in " + Address + ". I am " + Year + " year of " + Program + ".";
          }
      }
      