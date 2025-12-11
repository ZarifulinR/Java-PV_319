//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    List<Playable>  player = new ArrayList<>();
    player.add(new MusicPlayer());
    player.add(new VideoPlaye());
    for(Playable i: player){
        i.play();
    }
    Validator email = new EmailValidator();
    email.isValid("@.");
    Validator pass = new PasswordValidator();
    pass.isValid("s");
}
