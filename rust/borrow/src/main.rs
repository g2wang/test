fn main() {
    // let mut list = vec!("a".to_string(), "b".to_string());
    let mut list = vec!();
    println!("{}", get_lazy(&mut list).to_owned() + " get lazy");
}

fn get_lazy(list: &mut Vec<String>) -> &mut String {
    if list.is_empty() {
        list.push(format!("Hello, world"));
    }
    list.first_mut().unwrap()
}
