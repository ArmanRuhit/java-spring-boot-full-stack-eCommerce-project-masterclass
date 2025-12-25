## Section 3

### Introduction to `tight coupling` and `loose coupling`
- `Coupling`
  - refers to how closely connected different components or systems are
- `Tight Coupling`
  - describes a scenario where components are `highly dependent` on each other
- `Loose coupling`
  - describes a scenario where components are `independent` of each other

### Core Concept of Spring Framework
- `Inversion Of Controll (IOC)`
  - It is a design principle where the control of object creation and lifecycle management is transferred from the application code to an external container of framework.

- `Dependendency Injection (DI)`
  - It is a design pattern commonly used in object-oriented programming, where the dependencies of a class are provided externally rather than being created in the class itself.

- `Beans`
  - Objects that are managed by framework are known as `Beans`.

### Spring Containers and Configuration

- `Spring Container`
  - Responsible for managing `Beans`
- Types of `Spring Container`
  - `ApplicationContext`
  - `BeanFactory`
- How `Spring Container` understands which objects to manage?
  - Objects defined under `Configuration` file is automatically collected and managed by `Spring Container`
- `Configuration` contains `Bean` definition

- `Bean Definition`
  - A `bean definition` includes configuration metadata that the container needs to know to create and manage the bean
- `Bean Configuration`
  - `Bean definitions` can be provided in various ways, including XML configuration files and java based configuration
  - Beans are configured using XML files, where each bean is defined within `<bean>` tags with attributes specifying class, properties and dependencies.
  - Beans can be configured using annotations like `@Component`, `@Service`, `@Repository`, etc., which are scanned by Spring and managed as beans

- `Lifecycle of Beans`
  - Instantiation ⇒ Population of properties ⇒ Initialization ⇒ Ready for Use ⇒ Destruction 
- Dependency Injection Types
  - Constructor
  - Setter