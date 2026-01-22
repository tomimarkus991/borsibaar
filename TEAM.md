# Börsibaar Meeskond - Git Töövoo

## Meeskond

**Meeskonna nimi:** Team 25 - Börsibaar

**Meeskonna liikmed:**
- **Hannes** - Team Manager / Integrator
- **Ingrid** - Contributor
- **Taavi** - Contributor
- **Tomi** - Contributor
- **Johanna** - Contributor

## Töövoo põhimõtted

1. **Keelatud on otsesed push'id main'i** - kõik muudatused lähevad läbi Pull Request'i
2. **Iga funktsioon on oma branch'is** - üks branch = üks funktsioon/parandus
3. **Code Review on kohustuslik** - iga PR vajab vähemalt ühte review'd

---

## Ülesannete jagamine

### Hannes - Team Manager / Integrator

**Ülesanded:**
- Part 1: Commit'i TEAM.md fail (läbi Pull Request'i)
- Part 5: Merge strategies (vähemalt 2 erinevat merge tüüpi)
- Part 6: Final cleanup (kustutab merge'itud branch'id)

**Git käsud:**
```bash
git checkout main
git pull origin main
git checkout -b docs/add-team-workflow
git add TEAM.md
git commit -m "docs: add team workflow documentation"
git push -u origin docs/add-team-workflow
# Loo Pull Request GitHub'is ja merge'i

# Merge strateegiad GitHub'is: regular merge, squash merge, rebase merge
# Kustuta branch'id pärast merge'i:
git branch -d feature/branch-name
git push origin --delete feature/branch-name
```

---

### Ingrid - Feature 1

**Ülesanded:**
- Part 2: Loob feature branch'i ja arendab funktsiooni (vähemalt 3 commit'i)
- Part 4: Loob Pull Request'i ja vastab review'dele

**Git käsud:**
```bash
git checkout main
git pull origin main
git checkout -b feature/ingrid-funktsioon

# Tee mitu commit'i
git add failinimi.ext
git commit -m "feat: esimene osa funktsioonist"
git add teine-fail.ext
git commit -m "feat: teine osa funktsioonist"
git add kolmas-fail.ext
git commit -m "feat: viimane osa funktsioonist"

git push -u origin feature/ingrid-funktsioon
# Loo Pull Request GitHub'is

# Vasta review'dele (kui vaja):
git add parandatud-fail.ext
git commit -m "fix: parandatud review kommentaaride järgi"
git push
```

---

### Taavi - Feature 2

**Ülesanded:**
- Part 2: Loob feature branch'i ja arendab funktsiooni (vähemalt 3 commit'i)
- Part 4: Loob Pull Request'i ja vastab review'dele

**Git käsud:**
```bash
git checkout main
git pull origin main
git checkout -b feature/taavi-funktsioon

git add failinimi.ext
git commit -m "feat: algus funktsioonist"
git add teine-fail.ext
git commit -m "feat: keskosa funktsioonist"
git add kolmas-fail.ext
git commit -m "feat: lõpp funktsioonist"

git push -u origin feature/taavi-funktsioon
# Loo Pull Request GitHub'is
```

---

### Tomi - Feature 3 + Conflict Creation

**Ülesanded:**
- Part 2: Loob feature branch'i ja arendab funktsiooni (vähemalt 3 commit'i)
- Part 3: Loob konflikti (modifitseerib sama faili kui teine liige)

**Git käsud:**
```bash
git checkout main
git pull origin main
git checkout -b feature/tomi-funktsioon

git add failinimi.ext
git commit -m "feat: esimene commit"
git add teine-fail.ext
git commit -m "feat: teine commit"

# KONFLIKTI LOOMISEKS: muuda faili, mida teine liige ka muudab
git add konfliktne-fail.ext
git commit -m "feat: muudatus, mis loob konflikti"

git push -u origin feature/tomi-funktsioon
# Loo Pull Request GitHub'is (loob konflikti, kui teine liige on juba push'inud)
```

---

### Johanna - Conflict Resolution + Code Review

**Ülesanded:**
- Part 3: Lahendab merge konflikti
- Part 4: Review'b teiste PR'e (vähemalt 2 PR'd)

**Git käsud:**
```bash
# Konflikti lahendamine:
git checkout main
git pull origin main
git checkout feature/konfliktne-branch
git merge main

# Lahenda konfliktid failides (eemalda <<<<<<, ======, >>>>>> märgid)
git add lahendatud-fail.ext
git commit -m "fix: lahendatud merge konfliktid"
git push

# Code Review: GitHub'is Pull Requests → Review changes
```

---

## Commit message formaat

**Conventional Commits:**
- `feat:` - uus funktsioon
- `fix:` - bugi parandus
- `refactor:` - koodi refaktoorimine
- `docs:` - dokumentatsiooni muudatused

**Näited:**
```bash
git commit -m "feat: add inventory sorting feature"
git commit -m "fix: resolve dashboard loading issue"
```

---

## Merge strateegiad

1. **Regular Merge Commit** - säilitab täieliku ajaloo
2. **Squash Merge** - ühendab kõik commit'id üheks
3. **Rebase Merge** - loob lineaarse ajaloo

---

## Kasulikud käsud

```bash
git status              # Vaata olekut
git diff                # Vaata muudatusi
git log --oneline       # Vaata ajalugu
git restore fail.ext    # Tühista muudatused (HOIATUS!)
